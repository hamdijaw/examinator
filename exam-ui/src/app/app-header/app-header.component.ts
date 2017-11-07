import { Component, OnInit, Input } from '@angular/core';
import { UserData } from '../domain/UserData';
import { Router } from '@angular/router';

@Component({
  selector: 'app-app-header',
  templateUrl: './app-header.component.html',
  styleUrls: ['./app-header.component.css']
})
export class AppHeaderComponent implements OnInit {
  username: String = '';
  @Input() title: string;
  constructor(private router: Router) { }
  
  ngOnInit() {
    this.username = localStorage.getItem('username');
    if(this.username == undefined){
      this.router.navigate(['/login']);
    }
  }

  logoutUser() {
    localStorage.removeItem('username');
    this.router.navigate(['/login']);
  }

  userData: UserData;

}
