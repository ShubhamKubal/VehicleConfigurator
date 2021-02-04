import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AlternateConf } from '../models/alternate-conf';

@Injectable({
  providedIn: 'root'
})
export class AlternateService {

  constructor(private http : HttpClient) { }

  getAlternateConfByConfid(conf_id : number) : Observable<AlternateConf[]>{
    return this.http.get<AlternateConf[]>("http://localhost:8080/api/v1/alternateconfs/"+conf_id);
  }  
}
