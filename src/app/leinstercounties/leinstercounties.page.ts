import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-leinstercounties',
  templateUrl: './leinstercounties.page.html',
  styleUrls: ['./leinstercounties.page.scss'],
})
export class LeinstercountiesPage implements OnInit {

  players: string[] = ["Raúl gonzalez","Sergio Ramos","David Villa"];
  

  constructor() { }

  ngOnInit() {
  }

}
