import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExpenseComponent } from './expenses/expense.component';
import { ExpenseTypeComponent } from './expense-type/expense-type.component';
import { DashboardComponent } from './dashboard/dashboard.component';

// const routes: Routes = [];

const routes: Routes = [{
  path: '',redirectTo: '/dashboard/expenses', pathMatch: 'full'},
    {path: 'dashboard', component: DashboardComponent, children: [
      {path:'expenses', component: ExpenseComponent },
      { path: 'expensetypes', component: ExpenseTypeComponent }
    
    // { path: 'usersList', component: UserComponent },
    // { path: 'advertisersList', component: AdvertisersComponent },
    // { path: 'addCampaign/:id/:type', component: CampaignformComponent },
    // { path: 'addUser/:id', component: UserformComponent },
    // { path: 'addAdvertiser/:id', component: AdvertisersformComponent },
    // { path: 'campaignReport/:id/:advId/:type', component: CampaignreportComponent },
    // { path: 'navForm', component: NavbarformComponent },
    // {path : 'globalsettings', component : GlobalsettingComponent}
  ], runGuardsAndResolvers: 'always'
},
{ path: 'login', component: ExpenseComponent }
];
@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true, onSameUrlNavigation: 'reload',scrollPositionRestoration: 'enabled'})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
