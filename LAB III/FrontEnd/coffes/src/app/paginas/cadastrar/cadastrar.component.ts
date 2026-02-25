import { CoffeeService } from './../../servicos/coffee.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Coffee } from '../../modelos/Coffee';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-cadastrar',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './cadastrar.component.html',
  styleUrl: './cadastrar.component.css',
})
export class CadastrarComponent implements OnInit {
  coffee: Coffee = {
    id: 0,
    nome: '',
    descricao: '',
    tipo: '',
    preco: 0,
  };

  novoCoffeeForm: FormGroup | any;

  constructor(
    private coffeeService: CoffeeService,
    private formBuilder: FormBuilder
  ) {}

  ngOnInit(): void {
    this.initForm();
  }

  cadastrar(coffee: Coffee) {
    this.coffeeService.criar(coffee).subscribe();

  }
  initForm(){
    this.novoCoffeeForm = this.formBuilder.group({
      nome: [''],
      descricao: [''],
      tipo: [''],
      preco: [''],
      id: new FormControl(0),
    });
  }
  enviarForm() {

      const novoCoffee: Coffee = this.novoCoffeeForm.value;
      console.log(novoCoffee);
      this.cadastrar(novoCoffee);
      this.novoCoffeeForm.reset();

  }
}
