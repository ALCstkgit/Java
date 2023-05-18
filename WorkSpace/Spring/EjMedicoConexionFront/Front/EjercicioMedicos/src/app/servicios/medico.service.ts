import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable } from 'rxjs';
import { Medico } from '../clases/Medico';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {
  private url:String = "http://localhost:8080/medicos";

  constructor(private httpClient: HttpClient) { }
  listMedicos(): Observable<Medico[]>{
    return this.httpClient.get<Medico[]>(`${this.url}`)
  }
}
