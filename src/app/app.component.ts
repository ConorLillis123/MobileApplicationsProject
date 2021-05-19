import { Component, OnInit } from '@angular/core';
import { EuContService } from './Services/eu-cont.service';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss'],
})
export class AppComponent implements OnInit{
  title = "eu-app";
  countries:any =[];
  constructor(private service:EuContService) {

   
  }

  ngOnInit(){
    //A-sychronisation
    this.service.GetEUData().subscribe( (data)=>{
      this.countries = data.countries;
      //console.log(this.countries);
    });
  }

}
