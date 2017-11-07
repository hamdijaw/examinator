import { Exam } from '../domain/Exam';

export class UserData {
    userId: number;
    name: string;
    phone: string;
    email: string;
    active: boolean;
    entryDate: string;
    exams: Exam[];
    

    constructor(userId: number, userName: string, phone: string, email: string, active: boolean, entryDate: string) {
        this.userId = userId;
        this.name = userName;
        this.phone = phone;
        this.email = email;
        this.active = active;
        this.entryDate = entryDate;
      }
}