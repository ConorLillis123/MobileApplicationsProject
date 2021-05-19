import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { LeinstercountiesPageRoutingModule } from './leinstercounties-routing.module';

import { LeinstercountiesPage } from './leinstercounties.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    LeinstercountiesPageRoutingModule
  ],
  declarations: [LeinstercountiesPage]
})
export class LeinstercountiesPageModule {}
