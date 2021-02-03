import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Configuration } from '../models/configuration';

@Injectable({
  providedIn: 'root'
})
export class ConfigurationService {

  constructor(private http : HttpClient) { }

  getAllConfigurationsByVarid(var_id : number) : Observable<Configuration[]>{
    return this.http.get<Configuration[]>("http://localhost:8080/api/v1/configurations/"+var_id);
  }

  getAllDefaultFeatures(var_id : number) : Observable<Configuration[]>{
    return this.http.get<Configuration[]>("http://localhost:8080/api/v1/configurations/default/"+var_id);
  }

  getAllInteriorFeatures(var_id : number) : Observable<Configuration[]>{
    return this.http.get<Configuration[]>("http://localhost:8080/api/v1/configurations/interior/"+var_id);
  }

  getAllExteriorFeatures(var_id : number) : Observable<Configuration[]>{
    return this.http.get<Configuration[]>("http://localhost:8080/api/v1/configurations/exterior/"+var_id);
  }

  getAllAccessoriesFeatures(var_id : number) : Observable<Configuration[]>{
    return this.http.get<Configuration[]>("http://localhost:8080/api/v1/configurations/accessories/"+var_id);
  }

}
