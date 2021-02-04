import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessoriesComponent } from './components/accessories/accessories.component';
import { DefaultComponent } from './components/default/default.component';
import { ExteriorComponent } from './components/exterior/exterior.component';
import { HomeComponent } from './components/home/home.component';
import { InteriorComponent } from './components/interior/interior.component';
import { InvoiceComponent } from './components/invoice/invoice.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { StandardComponent } from './components/standard/standard.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

const routes: Routes = [
  { path: '', component:WelcomeComponent },
  { path: 'register', component:RegistrationComponent},
  { path: 'login', component:LoginComponent },
  { path: 'home', component:HomeComponent },
  { path: 'default', component:DefaultComponent},
  { path: 'configure', component:StandardComponent},
  { path: 'interior', component:InteriorComponent},
  { path: 'exterior', component:ExteriorComponent},
  { path: 'accessories', component:AccessoriesComponent},
  { path: 'invoice',component:InvoiceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
