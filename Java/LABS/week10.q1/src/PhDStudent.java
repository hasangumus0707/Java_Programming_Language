public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{

    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles)
    {
        super(id,mid,fin,numberOfArticles);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float computeTotalScore()
    {
        return super.computeTotalScore() + articleScore();
    }

    public float articleScore()
    {
        return numberOfArticles;
    }
}
