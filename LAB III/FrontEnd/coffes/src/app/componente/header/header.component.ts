import { Component } from '@angular/core';
import { RouterLink } from "@angular/router";
import {HomeComponent } from '../../paginas/home/home.component';
import { CadastrarComponent } from '../../paginas/cadastrar/cadastrar.component';
import { EditarComponent } from '../../paginas/editar/editar.component';
import { ListarComponent } from '../../paginas/listar/listar.component';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink, HomeComponent, CadastrarComponent,
     EditarComponent, ListarComponent],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

}
