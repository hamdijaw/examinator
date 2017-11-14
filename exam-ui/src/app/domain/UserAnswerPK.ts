export class UserAnswerPK {
    userId: number;
    examId: number;
    questionId: number;
    attempt: number;

    constructor(userId: number, examId: number, questionId: number, attempt: number) {
        this.userId = userId;
        this.examId = examId;
        this.questionId = questionId;
        this.attempt = attempt;

      }
}