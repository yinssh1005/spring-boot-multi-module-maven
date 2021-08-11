import lombok.*;
import org.springframework.data.jpa.domain.Specification;

@Data
public class NailSet {
	private Long id;
	@NonNull private String name;

	public <T> Specification<T> compareEqual() {
		return null;
	}
}
