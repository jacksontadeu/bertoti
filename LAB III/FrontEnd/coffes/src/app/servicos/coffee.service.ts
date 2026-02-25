import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Coffee } from '../modelos/Coffee';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root',
})

export class CoffeeService {
  private apiUrl = `${environment.ApiiUrl}`;

  constructor(public http: HttpClient) {}



  listar(): Observable<Coffee[]> {
    return this.http.get<Coffee[]>(`${this.apiUrl}/listartodos`);
    
  }

  criar(coffee: Coffee): Observable<Coffee> {
    return this.http.post<Coffee>(this.apiUrl, coffee);
  }

  editar(id: number, coffee: Coffee): Observable<Coffee> {
    return this.http.put<Coffee>(`${this.apiUrl}/${id}`, coffee);
  }
}
