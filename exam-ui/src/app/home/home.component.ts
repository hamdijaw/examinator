import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private userService: UserService, private router: Router) { }
  dataList:any[];
  questions:any[];
  ngOnInit() {
  //   this.userService.getExams().subscribe(data => {
  // this.dataList = data.json();
  // }, err => {
  //     console.log("Error Occured")
  //   });
    debugger
  this.userService.getExamsForUser("18", "111").subscribe(data => {
    this.dataList = data.json().exams;
    }, err => {
        console.log("Error Occured")
      });
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


}
