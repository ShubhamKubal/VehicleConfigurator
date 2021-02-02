import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../models/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http : HttpClient) { }

  addCustomerDetails(register : Customer) : Observable<Customer[]>{
    return this.http.post<Customer[]>("http://localhost:8080/api/v1/register",register);
  }

  checkCredetials(loginid : string, password : string) : Observable<string>{
    return this.http.get<string>("http://localhost:8080/api/v1/check/"+loginid+"/"+password);
  }
}
