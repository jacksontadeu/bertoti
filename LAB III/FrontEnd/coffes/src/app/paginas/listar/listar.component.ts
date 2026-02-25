import { Component, OnInit } from '@angular/core';
import { CoffeeService } from '../../servicos/coffee.service';
import { Coffee } from '../../modelos/Coffee';

@Component({
  selector: 'app-listar',
  standalone: true,
  imports: [],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListarComponent implements OnInit {
  constructor(private coffeeService: CoffeeService) {}
  coffee:Coffee={
    id:0,
    nome:'',
    descricao:'',
    tipo:'',
    preco:0
  }

  coffees: any[] = [];

  ngOnInit():void {
       this.coffeeService.listar().subscribe((data: any[]) => {
      this.coffees = data;
      
    });
  }



}
