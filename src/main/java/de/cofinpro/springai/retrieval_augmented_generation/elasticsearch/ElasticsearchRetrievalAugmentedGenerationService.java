package de.cofinpro.springai.retrieval_augmented_generation.elasticsearch;

import de.cofinpro.springai.retrieval_augmented_generation.AbstractRetrievalAugmentedGenerationService;
import org.springframework.ai.azure.openai.AzureOpenAiChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ElasticsearchRetrievalAugmentedGenerationService extends AbstractRetrievalAugmentedGenerationService {

    public ElasticsearchRetrievalAugmentedGenerationService(AzureOpenAiChatClient openAiChatClient, ElasticsearchVectorStore elasticsearchVectorStore,
                                                            @Value("classpath:/bikes.json") Resource bikesResource,
                                                            @Value("classpath:/system-prompt-template") Resource systemPromptTemplateResource) {
        super(elasticsearchVectorStore, openAiChatClient, systemPromptTemplateResource, bikesResource);
    }
}
