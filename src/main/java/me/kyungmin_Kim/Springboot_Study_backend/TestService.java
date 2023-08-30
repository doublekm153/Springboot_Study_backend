@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; //빈 주입

    public List<Member> getAllMember(){
        return memberRepository.findAll(); //멤버 목록 얻기.
    }
}