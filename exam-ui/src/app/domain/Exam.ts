import { Question } from '../domain/Question';
export class Exam {

    id: number;
    name: string;
    duration: number;
    questions: Question[];

}