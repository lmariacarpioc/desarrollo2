@RestController
@RequestMapping("/examenes")
@CrossOrigin("*")
public class ExamenController {

    @Autowired
    private ExamenService service;

    @GetMapping
    public List<Examen> listar() {
        return service.listar();
    }

    @PostMapping
    public Examen crear(@RequestBody Examen e) {
        return service.guardar(e);
    }
}