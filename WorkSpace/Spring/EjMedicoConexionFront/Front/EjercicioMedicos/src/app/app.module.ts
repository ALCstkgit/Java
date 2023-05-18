import {HttpClientModule, HttpClient} from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaMedicosComponent } from './lista-medicos/lista-medicos.component';
import { MedicoService } from './servicios/medico.service';

@NgModule({
  declarations: [
    AppComponent,
    ListaMedicosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [MedicoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
