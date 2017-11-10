export class UserExamId {

    userId: number;
    examId: number;
    attempt: number;
  
    constructor(userId: number, examId: number, attempt: number, examDate: string, marks: string) {
        this.userId = userId;
        this.examId = examId;
        this.attempt = attempt;
      }
}
