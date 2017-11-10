import { Exam } from '../domain/Exam';
import { UserExam } from '../domain/UserExam';

export class UserData {
    userId: number;
    name: string;
    phone: string;
    email: string;
    active: boolean;
    entryDate: string;
    exams: Exam[];
    userExams: UserExam[];

    constructor(userId: number, userName: string, phone: string, email: string, active: boolean, entryDate: string) {
        this.userId = userId;
        this.name = userName;
        this.phone = phone;
        this.email = email;
        this.active = active;
        this.entryDate = entryDate;
      }
}