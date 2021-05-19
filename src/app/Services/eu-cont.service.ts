import { Injectable } from '@angular/core';
//Importing the http client
import {HttpClient} from '@angular/common/http';
import{ Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EuContService {

  constructor(private http:HttpClient) { }

    //retrieving the data about countries in the Array from json
    GetEUData():Observable<any>{
     return this.http.get('https://www.jsonblob.com/api/json/5a04c015-b82a-11eb-a1ad-bbf49d2e0ccd');
    
  }
}
