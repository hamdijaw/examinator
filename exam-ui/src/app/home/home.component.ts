import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserData } from '../domain/UserData';
import { UserExam } from '../domain/UserExam';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private userService: UserService, private router: Router) { }
  dataList:any[];
  questions:any[];
  userData: UserData;
  userExams: UserExam[];

  ngOnInit() {
   this.userData = this.userService.userData;
  // this.dataList = data.json().exams;
  this.dataList = this.userService.dataList;
  debugger
  this.userExams = this.userData.userExams;
  }

  selectExam(exam) {
    // debugger
    console.log("inside selectExam method")
    this.userService.questions = exam.questions;
    this.userService.examId = exam.id;
    this.router.navigate(['/exampage']);
  }

  userdata: any = [];

  startExam() {
    console.log("inside startExam method")
    this.router.navigate(['/exampage']);
  }

  getExamMarks(examId) {
    debugger;

    let userExam = this.userExams.find(x => x.userExamId.examId === examId);
    return userExam.marks;
  }


}
