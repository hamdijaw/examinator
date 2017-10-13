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
  }
  userdata: any = [];
  onClickMe() {
    console.log("inside onClickeMe method")
    //alert("hello");
    this.userdata = this.user_service.authenticateUser();
    // this.router.navigate(['/home'], { queryParams: {}});
    this.router.navigate(['/home']);
  }
}
