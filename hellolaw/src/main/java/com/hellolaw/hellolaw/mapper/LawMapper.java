package com.hellolaw.hellolaw.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.hellolaw.hellolaw.dto.LawDetailResponse;
import com.hellolaw.hellolaw.dto.LawRankingResponse;
import com.hellolaw.hellolaw.entity.Law;
import com.hellolaw.hellolaw.internal.dto.LawInformationDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LawMapper {

	@Mapping(target = "lawName", source = "name")
	@Mapping(target = "lawDetail", source = "contents")
	public LawDetailResponse toLawDetailResponse(Law law);

	@Mapping(target = "name", source = "lawName")
	public Law toLaw(LawInformationDto lawInformationDto);

	@Mapping(target = "lawId", source = "id")
	@Mapping(target = "lawName", source = "name")
	public LawRankingResponse toSseResponse(Law law);
}