import { Component, OnInit } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UserService }          from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
	public user_service: UserService;
	constructor(private userService: UserService) {
		this.user_service = userService;
	}
	
	

 // constructor() { }

  ngOnInit() {
  }
userdata:any=[];
onClickMe() {
	console.log("inside onClickeMe method")
    //alert("hello");
	this.userdata =this.user_service.authenticateUser();
  }
}
