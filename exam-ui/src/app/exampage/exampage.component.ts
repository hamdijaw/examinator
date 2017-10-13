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
  constructor(private userService: UserService) { }

  ngOnInit() {
    debugger
    this.questionDataList = this.userService.getQuestions();
    this.maxIndex = this.questionDataList.length;
    this.questionVal = this.questionDataList[this.intialIndex];
  }
  nextQuestion() {
    debugger;
    if (this.intialIndex <= this.maxIndex) {
      this.intialIndex++;
      this.questionVal = this.questionDataList[this.intialIndex];
    }
  }
  previousQuestion() {
    debugger
    if (this.intialIndex > 0) {
      this.intialIndex--;
      this.questionVal = this.questionDataList[this.intialIndex];
    }
  }
}
