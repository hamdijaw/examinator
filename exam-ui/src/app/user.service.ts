import { Injectable } from '@angular/core';
import { HttpModule }    from '@angular/http';
import { Http }       from '@angular/http';
import 'rxjs/add/operator/toPromise';
// http://localhost:8080/examhttp://localhost:8080/user/authenticate
@Injectable()
export class UserService {
	constructor(private http: Http) { }
	authenticateUser() {
		//alert("user service");
		debugger
	return this.http.get("http://localhost:8080/exam")
             .toPromise()
             .then(response => response.json())
             .catch(this.handleError);
			 
	}
	
	private handleError(error: any): Promise<any> {
  return Promise.reject(error.message || error);
	}
}