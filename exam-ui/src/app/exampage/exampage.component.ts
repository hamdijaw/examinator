import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

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
  questions: any = {};
  currentIndex: number = 0;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.questionDataList = this.userService.getQuestions();
    this.maxIndex = this.questionDataList.length;
    this.questionVal = this.questionDataList[this.intialIndex];
    this.questions = this.userService.questions;
    debugger
    console.log('this.questions.length: ' + this.questions.length);
    console.log('this.questions[0]: ' + this.questions[0]);
    console.log('this.questions[0].body: ' + this.questions[0].body);    
    debugger
  }
  nextQuestion() {
    debugger;
    // if (this.intialIndex <= this.maxIndex) {
    //   this.intialIndex++;
    //   this.questionVal = this.questionDataList[this.intialIndex];
    // }
    this.currentIndex = this.currentIndex + 1;
  }
  previousQuestion() {
    debugger
    // if (this.intialIndex > 0) {
    //   this.intialIndex--;
    //   this.questionVal = this.questionDataList[this.intialIndex];
    // }
    this.currentIndex = this.currentIndex - 1;
  }
}
