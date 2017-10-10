import { ExamUiPage } from './app.po';

describe('exam-ui App', function() {
  let page: ExamUiPage;

  beforeEach(() => {
    page = new ExamUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
