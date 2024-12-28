import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from '../models/client';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http : HttpClient) { }





  getAllVoitures(): Observable<any> {
    return this.http.get(`http://localhost:8082/voitures`);
  }

  getVoitureById(id: number): Observable<any> {
    return this.http.get(`http://localhost:8082/voiture/${id}`);
  }

  createVoiture(id_client: number, voiture: any): Observable<any> {
    return this.http.post(`http://localhost:8082/voiture/${id_client}`, voiture);
  }

  updateVoiture(id: number, voiture: any): Observable<any> {
    return this.http.put(`http://localhost:8082/voiture/${id}`, voiture);
  }

  deleteVoiture(id: number): Observable<any> {
    return this.http.delete(`http://localhost:8082/voitures/voiture/${id}`);
  }

  getAllClients(): Observable<any> {
    return this.http.get(`http://localhost:8081/api/client`);
  }
  saveClient(client: Client): Observable<any> {
    return this.http.post('http://localhost:8081/api/client', client);
}

UpdateClient(id: number, client: Client): Observable<any> {
    return this.http.put(`http://localhost:8081/api/client/${id}`, client);
}

DeleteClient(id: number): Observable<any> {
    return this.http.delete(`http://localhost:8081/api/client/${id}`);
}

}
