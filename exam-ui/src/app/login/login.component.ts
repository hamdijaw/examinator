import { Component, OnInit } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UserService } from '../user.service';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public user_service: UserService;
  constructor(private userService: UserService, private router: Router) {
    this.user_service = userService;
  }

  // constructor() { }

  ngOnInit() {
    localStorage.removeItem("username");
  }
  userdata: any = [];
  userName: string='18';
  password: string='111';

  onClickMe() {
    console.log("inside onClickeMe method")
    
    //alert("hello");
    // this.userdata = this.user_service.authenticateUser(this.userName, this.password);
  
    // this.router.navigate(['/home'], { queryParams: {}});
    this.userService
    // .getExamsForUser(this.userService.userIdEntry, this.userService.passwordEntry)
        .getExamsForUser(this.userName, this.password)
        .subscribe(data => {
          this.userService.userData = data.json();
          // this.dataList = data.json().exams;
          this.userService.dataList = this.userService.userData.exams;
          this.router.navigate(['/home']);
         
          localStorage.setItem("username", this.userService.userData.name);
          debugger
      }, err => {
          console.log("Error Occured")
        });
    
    
  }
}
