import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment.prod';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {
  API_URL:string="http://localhost:7878";

  constructor(private httpClient: HttpClient) {
    // if(environment.production){
    //   this.API_URL="./"
    // }else{
    //   this.API_URL="http://localhost:7878"
    // }
   }
   

  getAllExpenseTypes() {
    return this.httpClient.get<any>(this.API_URL + '/getAllExpensesType').pipe(
      
      map(
        response => response)
       
    );
    
  }

}
