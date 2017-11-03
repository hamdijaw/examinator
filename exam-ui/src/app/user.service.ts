import { Injectable } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { UserAnswer } from './UserAnswer';

// http://localhost:8080/examhttp://localhost:8080/user/authenticate
@Injectable()
export class UserService {
	questions:any[];
	examId: number;
	test: any = "";
	
	constructor(private http: Http) { }


	saveAnswer(answer:UserAnswer) {
		// debugger
		return this.http.post('http://localhost:8080/user/answer', answer);
	}

	getExamsForUser(userId, password) {
		debugger
		let data = {
			'userId': userId,
			'password': password
		}
		var dataJson = JSON.stringify(data);
		var headers = new Headers();
		headers.append('Content-Type', 'application/json');
		debugger
		return this.http.post('http://localhost:8080/login/18', dataJson, {headers: headers});
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
	authenticateUser() {

		//alert("user service");
		var myStr = this.http.get("http://localhost:8080/user/authenticate")
			.toPromise()
			.then(response => {
				console.log("check: " + response.text());
				this.test = response.text();
			})
			.catch(this.handleError);
		console.log("aaaaaa");
		console.log("myStr: " + this.test);
		console.log("bbbbb");

		var exam = this.http.get("http://localhost:8080/exam")
			.toPromise()
			.then(response => response.json())
			.catch(this.handleError);
		console.log("exam: " + exam);
		// debugger
		return exam;
	}

	private handleError(error: any): Promise<any> {
		return Promise.reject(error.message || error);
	}
}