import { Injectable } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { UserAnswer } from './domain/UserAnswer';
import {environment} from 'environments/environment';
import { UserData } from './domain/UserData';

// http://localhost:8080/examhttp://localhost:8080/user/authenticate
@Injectable()
export class UserService {
	questions:any[];
	examId: number;
	test: any = "";
	userIdEntry: string;
	passwordEntry: string;
	userData: UserData;
	dataList:any[];
	
	constructor(private http: Http) { }


	saveAnswer(answer:UserAnswer) {
		debugger
		let urlString = environment.url + environment.saveAnswer;
		// return this.http.post('http://localhost:8080/user/answer', answer);
		return this.http.post(urlString, answer);
	}

	getExamsForUser(userIdEntryByUser, passwordEntryByUser) {
		debugger
		let data = {
			'userId': userIdEntryByUser,
			'password': passwordEntryByUser
		}
		var dataJson = JSON.stringify(data);
		var headers = new Headers();
		headers.append('Content-Type', 'application/json');
		let urlString = environment.url + environment.login + '/' + userIdEntryByUser;
		debugger
		// return this.http.post('http://localhost:8080/login/18', dataJson, {headers: headers});
		return this.http.post(urlString, dataJson, {headers: headers});
	}

	getExams() {
		// debugger
		return this.http.get('http://localhost:8080/admin/exam/all');
	}

	getQuestions() {
		var dataList = {};
		// this.http.get('http://localhost:8080/5/questions')
		// 	.subscribe(data => {
		// 		dataList = data.json()
		// 	}, err => {
		// 		console.log("Error")
		// 	});
		// 	console.log("dataa"+dataList);
		return dataList;
	}

	authenticateUser(userIdEntry, passwordEntry) {
		this.userIdEntry = userIdEntry;
		this.passwordEntry = passwordEntry;
		//alert("user service");
		// var myStr = this.http.get("http://localhost:8080/user/authenticate")
		// 	.toPromise()
		// 	.then(response => {
		// 		console.log("check: " + response.text());
		// 		this.test = response.text();
		// 	})
		// 	.catch(this.handleError);
		// console.log("aaaaaa");
		// console.log("myStr: " + this.test);
		// console.log("bbbbb");

		// var exam = this.http.get("http://localhost:8080/exam")
		// 	.toPromise()
		// 	.then(response => response.json())
		// 	.catch(this.handleError);
		// console.log("exam: " + exam);
		// debugger
		// return exam;
	}

	private handleError(error: any): Promise<any> {
		return Promise.reject(error.message || error);
	}
}