import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Rx';
// import { Observable } from 'rxjs/Observable';
// import 'rxjs/add/observable/timer';
// import 'rxjs/add/observable/take';

@Component({
  selector: 'app-timer',
  templateUrl: './timer.component.html',
  styleUrls: ['./timer.component.css']
})
export class TimerComponent implements OnInit {


  countDown;
  min: number = 2;
  second: number = 10;
  duration = 180;
  clearInterval: any;

  constructor() {
    this.clearInterval = setInterval(() => {
      if (this.second === 0) {
        this.min = --this.min;
        this.second = 10;

      }
      this.second = --this.second;
    }, 1000);

    // this.countDown = Observable.timer(0, 1000)
    //   .take(this.second)
    //   .map(() => {

    //     if (this.second === 0) {
    //       --this.min;
    //       this.second = 10;

    //     }
    //     --this.second
    //     return this.second;
    //   });
  }
  myStopFunction() {
    clearInterval(this.clearInterval);
  }

  ngOnInit() {
  }

}
