import { UserExamId } from '../domain/UserExamId';
export class UserExam {

    userId: number;
    examId: number;
    attempt: number;
    examDate: string;
    marks: string;
    userExamId: UserExamId;

    constructor(userId: number, examId: number, attempt: number, examDate: string, marks: string, userExamId: UserExamId) {
        this.userId = userId;
        this.examId = examId;
        this.attempt = attempt;
        this.examDate = examDate;
        this.marks = marks;
        this.userExamId = userExamId;
      }
}
