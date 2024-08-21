package jake.myga_back.docs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;

@ExtendWith(RestDocumentationExtension.class)
public abstract class RestDocsSupport {

    protected MockMvc mockMvc;

    protected abstract Object initController();

    @BeforeEach
    void setUp(RestDocumentationContextProvider restDocumentation) {
        // 문서를 만들 때마다 Spring 서버를 실행할 필요가 없으므로 standaloneSetup 사용
        // spring에 대한 의존 없이 문서 생성
        this.mockMvc = MockMvcBuilders.standaloneSetup(initController())
                .apply(documentationConfiguration(restDocumentation))
                .build();
    }

}
