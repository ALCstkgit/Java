import { Component } from '@angular/core';
import { MedicoService } from '../servicios/medico.service';
import { Medico } from '../clases/Medico';

@Component({
  selector: 'app-lista-medicos',
  templateUrl: './lista-medicos.component.html',
  styleUrls: ['./lista-medicos.component.css']
})
export class ListaMedicosComponent {
  medicos:Medico[]
  constructor(public medicoService:MedicoService){
    this.medicos = []
  }

  ngOnInit(){
    this.medicoService.listMedicos().subscribe(med => {this.medicos = med})  }
}
