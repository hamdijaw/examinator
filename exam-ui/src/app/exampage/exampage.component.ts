import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { UserAnswer } from '../UserAnswer';

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
  answerText: string;
  nextFlag: boolean;
  prevFlag: boolean;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.questionDataList = this.userService.getQuestions();
    this.maxIndex = this.questionDataList.length;
    this.questionVal = this.questionDataList[this.intialIndex];
    this.questions = this.userService.questions;
    this.toggleFlags();
    debugger
    console.log('this.questions.length: ' + this.questions.length);
    console.log('this.questions[0]: ' + this.questions[0]);
    console.log('this.questions[0].body: ' + this.questions[0].body);
    debugger
  }
 

  nextQuestion() {
    if(this.questions.length-1==this.currentIndex){
      return;
    }
    debugger;
    // if (this.intialIndex <= this.maxIndex) {
      //   this.intialIndex++;
      //   this.questionVal = this.questionDataList[this.intialIndex];
      // }
      if (this.answerText != null && this.answerText.trim.length > 0) {
        this.userAnswer = new UserAnswer(18, 1, 4, this.answerText);
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
      this.currentIndex = this.currentIndex + 1;
      this.toggleFlags();
     

  }
  previousQuestion() {
    debugger
    // if (this.intialIndex > 0) {
    //   this.intialIndex--;
    //   this.questionVal = this.questionDataList[this.intialIndex];
    // }
    this.currentIndex = this.currentIndex - 1;
    this.toggleFlags();
  }

  toggleFlags(){
    this.prevFlag = this.currentIndex <=0;
    this.nextFlag = this.currentIndex>this.questions.length-2;
  }
}
