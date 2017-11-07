import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { UserAnswer } from '../domain/UserAnswer';

@Component({
  selector: 'app-exampage',
  templateUrl: './exampage.component.html',
  styleUrls: ['./exampage.component.css']
})
export class ExampageComponent implements OnInit {
  questionsdata: any = [];
  maxIndex: any = 0;
  intialIndex: any = 0;
  questionDataList: any = [];
  questionVal: any = {};
  questions: any = [];
  currentIndex: number = 0;
  userAnswer: UserAnswer;
  userAnswerArray: UserAnswer[] = [];
  // userAnswerArray: any[] =[];
  answerText: string;
  nextFlag: boolean;
  prevFlag: boolean;
  examId: number;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.questionDataList = this.userService.getQuestions();
    this.maxIndex = this.questionDataList.length;
    this.questionVal = this.questionDataList[this.intialIndex];
    this.questions = this.userService.questions;
    this.examId = this.userService.examId;
    this.toggleFlags();
    // debugger
    console.log('this.questions.length: ' + this.questions.length);
    console.log('this.questions[0]: ' + this.questions[0]);
    console.log('this.questions[0].body: ' + this.questions[0].body);
    // debugger
  }
 
  submitExam() {

  }

  nextQuestion() {
    if(this.questions.length-1 == this.currentIndex) {
      return;
    }

    debugger;
    
    // this.answerText = this.userAnswerArray[this.currentIndex + 1].answerText != null ? this.userAnswerArray[this.currentIndex + 1].answerText : null;
      // TODO: remove hardcoding below in UserAnswer constructor
      var userAnswerTempOrig: UserAnswer =  this.userAnswerArray[this.currentIndex];
      var userAnswerOrig = userAnswerTempOrig ? userAnswerTempOrig.answerEntered : null;
      var userAnswerTemp: UserAnswer = new UserAnswer(18, this.examId, this.questions[this.currentIndex].id, this.answerText);
      this.userAnswerArray[this.currentIndex] = userAnswerTemp;
      // TODO: set answerText to appropriate index text value
      // this.itemArray.items[index] = newItem;
      // replace into an array
      // this.userAnswerArray.splice(this.currentIndex, 1, userAnswerTemp);
      // insert into an array
      // this.userAnswerArray.splice(this.currentIndex, 0, userAnswerTemp);
      this.saveAnswer(userAnswerTemp, userAnswerOrig);
      debugger;
      var userAnswerTemp2: UserAnswer =  this.userAnswerArray[this.currentIndex + 1];
      this.answerText = userAnswerTemp2 ? userAnswerTemp2.answerEntered : null;
      this.currentIndex = this.currentIndex + 1;
      this.toggleFlags();

  }
  previousQuestion() {
    debugger
    // if (this.intialIndex > 0) {
    //   this.intialIndex--;
    //   this.questionVal = this.questionDataList[this.intialIndex];
    // }
    var userAnswerTempOrig: UserAnswer =  this.userAnswerArray[this.currentIndex];
    var userAnswerOrig = userAnswerTempOrig ? userAnswerTempOrig.answerEntered : null;
    var userAnswerTemp: UserAnswer = new UserAnswer(18, 1, this.questions[this.currentIndex].id, this.answerText);
    this.userAnswerArray[this.currentIndex] = userAnswerTemp;
    this.saveAnswer(userAnswerTemp, userAnswerOrig);
    var userAnswerTemp2: UserAnswer =  this.userAnswerArray[this.currentIndex - 1];
    this.answerText = userAnswerTemp != null ? userAnswerTemp2.answerEntered : null;
    this.currentIndex = this.currentIndex - 1;
    this.toggleFlags();
  }

  saveAnswer(userAnswerTemp, oldAnswerEntered) {
    // if (userAnswerTemp && userAnswerTemp.answerEntered != this.answerText && this.answerText != null && this.answerText.trim().length > 0) {
      // if (userAnswerTemp && this.answerText != null && this.answerText.trim().length > 0) {
    if (userAnswerTemp && userAnswerTemp.answerEntered != oldAnswerEntered) {
      userAnswerTemp.answerEntered = this.answerText;
      this.userAnswer = userAnswerTemp;
      debugger
      this.userService.saveAnswer(this.userAnswer).subscribe(data => {
        console.log('answer saved successfully');
        console.log('java returned: ' + data.text);
      }, err => {
        console.log("Error Occured")
      });
      debugger
      this.answerText = null;
    }
  }

  toggleFlags(){
    this.prevFlag = this.currentIndex <= 0;
    this.nextFlag = this.currentIndex > this.questions.length - 2;
  }
}
