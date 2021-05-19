import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ConnaughtcountiesPageRoutingModule } from './connaughtcounties-routing.module';

import { ConnaughtcountiesPage } from './connaughtcounties.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ConnaughtcountiesPageRoutingModule
    
  ],
  exports :[ConnaughtcountiesPage],
  declarations: [ConnaughtcountiesPage]
})
export class ConnaughtcountiesPageModule {}
