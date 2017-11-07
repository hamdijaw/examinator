import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserData } from '../domain/UserData';

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

  ngOnInit() {
    
  //   this.userService.getExams().subscribe(data => {
  // this.dataList = data.json();
  // }, err => {
  //     console.log("Error Occured")
  //   });
    debugger
  // this.userService.getExamsForUser(this.userService.userIdEntry, this.userService.passwordEntry).subscribe(data => {
  //   this.userData = data.json();
  //   // this.dataList = data.json().exams;
  //   this.dataList = this.userData.exams;
   
  //   debugger
  //   }, err => {
  //       console.log("Error Occured")
  //     });

   this.userData = this.userService.userData;
  // this.dataList = data.json().exams;
  this.dataList = this.userService.dataList;
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
