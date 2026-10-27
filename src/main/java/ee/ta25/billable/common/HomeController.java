@GetMapping("/")
public String home(Model model){
  model.addAttribute("today",LocalDate.now(TALLINN));
  return "home";}

void main() {
}
