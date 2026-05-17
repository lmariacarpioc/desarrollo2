@Service
public class ExamenService {

    @Autowired
    private ExamenRepository repo;

    public List<Examen> listar() {
        return repo.findAll();
    }

    public Examen guardar(Examen e) {
        return repo.save(e);
    }
}