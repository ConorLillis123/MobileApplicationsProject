import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LeinstercountiesPage } from './leinstercounties.page';

const routes: Routes = [
  {
    path: '',
    component: LeinstercountiesPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class LeinstercountiesPageRoutingModule {}
