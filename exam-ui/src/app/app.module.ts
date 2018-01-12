import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserService } from './user.service';
import { Routes, RouterModule } from '@angular/router';
import { ExampageComponent } from './exampage/exampage.component';
import { SignupComponent } from './auth/signup/signup.component';
import { SigninComponent } from './auth/signin/signin.component';
import { AppHeaderComponent } from './app-header/app-header.component';
import { ExampageMcqComponent } from './exampage-mcq/exampage-mcq.component';
import { TimerComponent } from './timer/timer.component';

const appRoutes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'home', component: HomeComponent,
    children: [
      { path: 'exampage', component: ExampageComponent },
      { path: 'exampage-mcq', component: ExampageMcqComponent }
    ] },
  { path: 'login', component: LoginComponent },
  { path: 'exampage', component: ExampageComponent },
  { path: 'exampage-mcq', component: ExampageMcqComponent },
  { path: 'signup', component: SignupComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    ExampageComponent,
    SignupComponent,
    SigninComponent,
    AppHeaderComponent,
    ExampageMcqComponent,
    TimerComponent
  ],
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { 
constructor(private userService: UserService) { }
}
