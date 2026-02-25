import { Routes } from '@angular/router';
import { HomeComponent } from './paginas/home/home.component';
import { CadastrarComponent } from './paginas/cadastrar/cadastrar.component';
import { EditarComponent } from './paginas/editar/editar.component';
import { ListarComponent } from './paginas/listar/listar.component';


export const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path:'cadastrar', component: CadastrarComponent},
  {path: 'editar', component: EditarComponent},
  {path: 'listar', component: ListarComponent},
  {path: '', redirectTo: 'home', pathMatch: 'full' }
];
