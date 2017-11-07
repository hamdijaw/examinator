export class UserAnswer {
    userId: number;
    examId: number;
    questionId: number;;
    answerEntered: string;

    constructor(userId: number, examId: number, questionId: number, answerEntered: string) {
        this.userId = userId;
        this.examId = examId;
        this.questionId = questionId;
        this.answerEntered = answerEntered;

      }
}