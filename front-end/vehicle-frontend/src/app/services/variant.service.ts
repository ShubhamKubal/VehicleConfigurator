import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Variant } from '../models/variant';

@Injectable({
  providedIn: 'root'
})
export class VariantService {

  constructor(private http : HttpClient) { }

  getAllVariantsBySegidAndManid(seg_id:number, man_id:number):Observable<Variant[]>{
    return this.http.get<Variant[]>("http://localhost:8080/api/v1/variants/"+seg_id+"/"+man_id);
  }
}
