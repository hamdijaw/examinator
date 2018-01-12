import { Answer } from './Answer';
export class Question {
    id: number;
    body: string;
    selected: string;
    answers: Answer[];
}